package com.squareup.javapoet.generated;

import com.google.common.truth.Truth;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import java.util.Collections;
import java.util.List;
import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;

public final class ClassNameNoPackageTest {

    /**
     * original test case
     */
    @Test public void shouldSupportClassInDefaultPackage() {
        ClassName className = ClassName.get(ClassNameNoPackageTest.class);
        assertThat(className.packageName()).isEqualTo("");
        assertThat(className.simpleName()).isEqualTo("ClassNameNoPackageTest");
        assertThat(className.toString()).isEqualTo("ClassNameNoPackageTest");
    }

    /**
     * Amplified test case 'shouldSupportClassInDefaultPackage_2'  Input modifications: 1 Assert
     * statements added: 1  This test case improves the coverage in these classes/methods/lines: (Click on the green
     * links to see these lines within the class) com.squareup.javapoet.ClassName: annotated L. 69 +11 instr. L. 70
     * +2 instr. com.squareup.javapoet.TypeName: concatAnnotations L. 125 +6 instr. L. 126 +4 instr. L. 127 +2 instr.
     * @throws Exception
     */
    @Test(timeout = 10000)
    public void shouldSupportClassInDefaultPackage_2() throws Exception {
        List<AnnotationSpec> __DSPOT_annotations_0 = Collections.<AnnotationSpec>emptyList();
        ClassName className = ClassName.get(ClassNameNoPackageTest.class);
        ClassName o_shouldSupportClassInDefaultPackage_mg11__5 = className.annotated(__DSPOT_annotations_0);
        Truth.assertThat(((ClassName) (o_shouldSupportClassInDefaultPackage_mg11__5)).isAnnotated()).isFalse();
    }

    /**
     * Amplified test case 'shouldSupportClassInDefaultPackage_excluded'  Input modifications: 0 Assert statements
     * added: 1  This test case improves the coverage in these classes/methods/lines: (Click on the green links to
     * see these lines within the class) com.squareup.javapoet.ClassName: emit L. 268 +9 instr. L. 269 +6 instr. L.
     * 270 +3 instr. com.squareup.javapoet.TypeName: isBoxedPrimitive L. 147 +7 instr. L. 148 +4 instr. L. 149 +4
     * instr. L. 150 +4 instr. L. 151 +4 instr. L. 152 +4 instr. L. 153 +4 instr. L. 154 +3 instr. equals L. 196 +3
     * instr. L. 197 +2 instr. L. 198 +5 instr. L. 199 +6 instr. com.squareup.javapoet.CodeWriter: importableType L.
     * 415 +4 instr. L. 417 +6 instr. L. 421 +3 instr. L. 422 +3 instr. L. 423 +7 instr. L. 424 +2 instr. L. 427 +1
     * instr. lookupName L. 406 +3 instr. L. 407 +3 instr. L. 410 +3 instr.
     * @throws Exception
     */
    @Test(timeout = 10000)
    public void shouldSupportClassInDefaultPackage_excluded() throws Exception {
        ClassName className = ClassName.get(ClassNameNoPackageTest.class);
        Truth.assertThat(((ClassName) (className)).isBoxedPrimitive()).isFalse();
    }
}
