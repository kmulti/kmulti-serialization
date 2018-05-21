package kmulti.serialization

import kotlin.test.Test
import kotlin.test.assertTrue

class SerializationExtTest {
    @Test
    fun testStringToUtf8ByteBufferRoundtrip() {
        val input = "Have a nice Kotlin!"
        val bytes = input.toUtf8ByteBuffer()
        val output = bytes.fromUtf8BytesToString()
        assertTrue { input == output }
    }
}
