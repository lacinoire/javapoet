package com.squareup.javapoet.generated;
import com.google.common.truth.Truth;
import com.google.testing.compile.CompilationRule;
import javax.annotation.Nullable;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ParameterSpec;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import com.google.testing.compile.CompilationRule;
import javax.annotation.Nullable;
import static com.google.common.truth.Truth.assertThat;
public class ParameterSpecTest {
    @Rule
    public final CompilationRule compilation = new CompilationRule();

    private Elements elements;

    @Before
    public void setUp() {
        elements = compilation.getElements();
    }

    private TypeElement getElement(Class<?> clazz) {
        return elements.getTypeElement(clazz.getCanonicalName());
    }

    final class VariableElementFieldClass {
        String name;
    }

    final class VariableElementParameterClass {
        public void foo(@Nullable
        final String bar) {
        }
    }

    /**
     * original test case
     */
    @Test public void modifyAnnotations() {
        ParameterSpec.Builder builder = ParameterSpec.builder(int.class, "foo")
                                                     .addAnnotation(Override.class)
                                                     .addAnnotation(SuppressWarnings.class);

        builder.annotations.remove(1);
        assertThat(builder.build().annotations).hasSize(1);
    }

    /**
     * Amplified test case 'modifyAnnotations_3'  Input modifications: 0 Assert statements added: 1
     * This test case improves the coverage in these classes/methods/lines: (Click on the green links to see these
     * lines within the class) com.squareup.javapoet.AnnotationSpec: equals L. 172 +3 instr. L. 173 +2 instr. L. 174
     * +7 instr. =
     * @throws Exception
     */
    @Test(timeout = 10000)
    public void modifyAnnotations_3() throws Exception {
        Object __DSPOT_o_3 = new Object();
        ParameterSpec.Builder builder = ParameterSpec.builder(int.class, "foo").addAnnotation(Override.class).addAnnotation(SuppressWarnings.class);
        AnnotationSpec __DSPOT_invoc_5 = builder.annotations.remove(1);
        boolean o_modifyAnnotations_rv27__9 = __DSPOT_invoc_5.equals(__DSPOT_o_3);
        Truth.assertThat(o_modifyAnnotations_rv27__9).isFalse();
    }

    /**
     * Amplified test case 'modifyAnnotations_4'  Input modifications: 1 Assert statements added: 1  This
     * test case improves the coverage in these classes/methods/lines: (Click on the green links to see these lines
     * within the class) com.squareup.javapoet.CodeWriter: emitAnnotations L. 165 +4 instr. L. 166 +4 instr. L. 167
     * +7 instr. L. 168 +1 instr.
     * @throws Exception
     */
    @Test(timeout = 10000)
    public void modifyAnnotations_4() throws Exception {
        ParameterSpec.Builder builder = ParameterSpec.builder(int.class, "foo").addAnnotation(Override.class).addAnnotation(SuppressWarnings.class);
        builder.annotations.remove(1);
        ParameterSpec o_modifyAnnotations_mg25__6 = builder.build();
        Truth.assertThat(((ParameterSpec) (o_modifyAnnotations_mg25__6)).toString()).isEqualTo("@java.lang.Override int foo");
    }

    /**
     * Amplified test case 'modifyAnnotations_5'  Input modifications: 1 Assert statements added: 1  This test
     * case improves the coverage in these classes/methods/lines: (Click on the green links to see these lines within
     * the class) com.squareup.javapoet.CodeBlock$Builder: addArgument L. 12 +7 instr. L. 13 +1 instr. argToType L. 1
     * +6 instr. com.squareup.javapoet.CodeWriter$Multiset: contains L. 1 +11 instr. com.squareup.javapoet
     * .AnnotationSpec: toString L. 183 +4 instr. L. 185 +5 instr. L. 186 +10 instr. L. 187 +3 instr. emit L. 54 +5
     * instr. L. 55 +5 instr. L. 56 +4 instr. L. 58 +12 instr. L. 85 +1 instr. com.squareup.javapoet.ClassName:
     * enclosingClassName L. 98 +3 instr. simpleName L. 151 +3 instr. enclosingClasses L. 294 +4 instr. L. 295 +8
     * instr. L. 296 +4 instr. L. 298 +2 instr. L. 299 +2 instr. topLevelClassName L. 106 +5 instr. isAnnotated L. 82
     * +8 instr. packageName L. 90 +3 instr. emit L. 255 +2 instr. L. 256 +11 instr. L. 258 +2 instr. L. 263 +6 instr
     * . L. 265 +4 instr. L. 266 +4 instr. L. 267 +3 instr. L. 268 +9 instr. L. 269 +6 instr. L. 270 +3 instr. L. 280
     * +3 instr. L. 285 +4 instr. L. 286 +2 instr. L. 287 +1 instr. L. 289 +2 instr. com.squareup.javapoet
     * .CodeWriter: resolve L. 435 +8 instr. L. 443 +4 instr. L. 448 +6 instr. L. 449 +2 instr. L. 452 +2 instr.
     * importableType L. 415 +4 instr. L. 417 +6 instr. L. 421 +3 instr. L. 422 +3 instr. L. 423 +7 instr. L. 424 +2
     * instr. L. 427 +1 instr. emit L. 254 +7 instr. L. 256 +6 instr. L. 266 +4 instr. L. 267 +1 instr. lookupName L.
     * 375 +4 instr. L. 376 +5 instr. L. 382 +2 instr. L. 383 +8 instr. L. 384 +5 instr. L. 385 +4 instr. L. 387 +2
     * instr. L. 395 +2 instr. L. 400 +6 instr. L. 406 +3 instr. L. 407 +3 instr. L. 410 +3 instr. emitLiteral L. 359
     * +3 instr. L. 360 +4 instr.
     * @throws Exception
     */
    @Test(timeout = 10000)
    public void modifyAnnotations_5() throws Exception {
        ParameterSpec.Builder builder = ParameterSpec.builder(int.class, "foo").addAnnotation(Override.class).addAnnotation(SuppressWarnings.class);
        AnnotationSpec o_modifyAnnotations__5 = builder.annotations.remove(1);
        Truth.assertThat(((AnnotationSpec) (o_modifyAnnotations__5)).toString()).isEqualTo("@java.lang.SuppressWarnings");
    }

    /**
     * Amplified test case 'modifyAnnotations_excluded'  Input modifications: 1 Assert statements added: 1  This test
     * case improves the coverage in these classes/methods/lines: (Click on the green links to see these lines within
     * the class) com.squareup.javapoet.CodeBlock$Builder: addArgument L. 12 +7 instr. L. 13 +1 instr. argToType L. 1
     * +6 instr. com.squareup.javapoet.CodeWriter$Multiset: contains L. 1 +11 instr. com.squareup.javapoet
     * .AnnotationSpec: hashCode L. 179 +4 instr. toString L. 183 +4 instr. L. 185 +5 instr. L. 186 +10 instr. L. 187
     * +3 instr. emit L. 54 +5 instr. L. 55 +5 instr. L. 56 +4 instr. L. 58 +12 instr. L. 85 +1 instr. com.squareup
     * .javapoet.ClassName: enclosingClassName L. 98 +3 instr. simpleName L. 151 +3 instr. enclosingClasses L. 294 +4
     * instr. L. 295 +8 instr. L. 296 +4 instr. L. 298 +2 instr. L. 299 +2 instr. topLevelClassName L. 106 +5 instr.
     * isAnnotated L. 82 +8 instr. packageName L. 90 +3 instr. emit L. 255 +2 instr. L. 256 +11 instr. L. 258 +2
     * instr. L. 263 +6 instr. L. 265 +4 instr. L. 266 +4 instr. L. 267 +3 instr. L. 268 +9 instr. L. 269 +6 instr. L
     * . 270 +3 instr. L. 280 +3 instr. L. 285 +4 instr. L. 286 +2 instr. L. 287 +1 instr. L. 289 +2 instr. com
     * .squareup.javapoet.CodeWriter: resolve L. 435 +8 instr. L. 443 +4 instr. L. 448 +6 instr. L. 449 +2 instr. L.
     * 452 +2 instr. importableType L. 415 +4 instr. L. 417 +6 instr. L. 421 +3 instr. L. 422 +3 instr. L. 423 +7
     * instr. L. 424 +2 instr. L. 427 +1 instr. emit L. 254 +7 instr. L. 256 +6 instr. L. 266 +4 instr. L. 267 +1
     * instr. lookupName L. 375 +4 instr. L. 376 +5 instr. L. 382 +2 instr. L. 383 +8 instr. L. 384 +5 instr. L. 385
     * +4 instr. L. 387 +2 instr. L. 395 +2 instr. L. 400 +6 instr. L. 406 +3 instr. L. 407 +3 instr. L. 410 +3 instr
     * . emitLiteral L. 359 +3 instr. L. 360 +4 instr.
     * @throws Exception
     */
    @Test(timeout = 10000)
    public void modifyAnnotations_excluded() throws Exception {
        ParameterSpec.Builder builder = ParameterSpec.builder(int.class, "foo").addAnnotation(Override.class).addAnnotation(SuppressWarnings.class);
        AnnotationSpec o_modifyAnnotations__5 = builder.annotations.remove(1);
        Truth.assertThat(((int) (((AnnotationSpec) (o_modifyAnnotations__5)).hashCode()))).isEqualTo(-1410730048);
    }
}
