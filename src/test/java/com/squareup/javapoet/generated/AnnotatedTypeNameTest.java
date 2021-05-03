package com.squareup.javapoet.generated;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.TypeName;
import org.junit.Assert;
import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.*;

public class AnnotatedTypeNameTest {
    private static final String NN = NeverNull.class.getCanonicalName();

    private final AnnotationSpec NEVER_NULL = AnnotationSpec.builder(NeverNull.class).build();

    private static final String TUA = TypeUseAnnotation.class.getCanonicalName();

    private final AnnotationSpec TYPE_USE_ANNOTATION = AnnotationSpec.builder(TypeUseAnnotation.class).build();

    @Target(ElementType.TYPE_USE)
    public @interface NeverNull {}

    @Target(ElementType.TYPE_USE)
    public @interface TypeUseAnnotation {}

    /**
     * original test case
     */
    @Test public void annotated() {
        TypeName simpleString = TypeName.get(String.class);
        assertFalse(simpleString.isAnnotated());
        assertEquals(simpleString, TypeName.get(String.class));

        TypeName annotated = simpleString.annotated(NEVER_NULL);
        assertTrue(annotated.isAnnotated());
        assertEquals(annotated, annotated.annotated());
    }

    /**
     * Amplified test case 'annotated_1'
     *
     * Input modifications: 2
     * Assert statements added: 3
     *
     * This test case improves the coverage in these classes/methods/lines:
     * com.squareup.javapoet.TypeName:
     * unbox
     * L. 182 +3 instr.
     * L. 183 +4 instr.
     * L. 184 +4 instr.
     * L. 185 +4 instr.
     * L. 186 +4 instr.
     * L. 187 +4 instr.
     * L. 188 +4 instr.
     * L. 189 +4 instr.
     * L. 190 +4 instr.
     * L. 191 +4 instr.
     * L. 192 +12 instr.
     * @throws Exception
     */
    @Test(timeout = 10000)
    public void annotated_1() throws Exception {
        try {
            TypeName simpleString = TypeName.get(String.class);
            simpleString.isAnnotated();
            TypeName.get(String.class);
            TypeName annotated = simpleString.annotated(NEVER_NULL);
            annotated.unbox();
            Assert.fail("annotated_1 should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            Assert.assertEquals("cannot unbox java.lang. @com.squareup.javapoet.generated.AnnotatedTypeNameTest" +
                                ".NeverNull " +
                                "String", expected.getMessage());
        }
    }

}
