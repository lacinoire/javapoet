package com.squareup.javapoet.generated;
import com.squareup.javapoet.NameAllocator;
import org.junit.Assert;
import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;
public final class NameAllocatorTest {

    /**
     * original test case
     * @throws Exception
     */
    @Test public void cloneUsage() throws Exception {
        NameAllocator outterAllocator = new NameAllocator();
        outterAllocator.newName("foo", 1);

        NameAllocator innerAllocator1 = outterAllocator.clone();
        assertThat(innerAllocator1.newName("bar", 2)).isEqualTo("bar");
        assertThat(innerAllocator1.newName("foo", 3)).isEqualTo("foo_");

        NameAllocator innerAllocator2 = outterAllocator.clone();
        assertThat(innerAllocator2.newName("foo", 2)).isEqualTo("foo_");
        assertThat(innerAllocator2.newName("bar", 3)).isEqualTo("bar");
    }

    /**
     * Amplified test case 'cloneUsagenull33_failAssert0'  Input modifications: 1 Assert statements added: 1  This
     * test case improves the coverage in these classes/methods/lines: (Click on the green links to see these lines
     * within the class) com.squareup.javapoet.Util: checkNotNull L. 57 +7 instr.
     * @throws Exception
     */
    @Test(timeout = 10000)
    public void cloneUsagenull33_failAssert0() throws Exception {
        try {
            NameAllocator outterAllocator = new NameAllocator();
            outterAllocator.newName(null, 1);
            NameAllocator innerAllocator1 = outterAllocator.clone();
            NameAllocator innerAllocator2 = outterAllocator.clone();
            Assert.fail("cloneUsagenull33 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("suggestion", expected.getMessage());
        }
    }
}
