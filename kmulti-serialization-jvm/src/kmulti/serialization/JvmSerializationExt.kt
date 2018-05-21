package kmulti.serialization

import kotlinx.io.ByteBuffer
import kotlinx.serialization.toUtf8Bytes

actual fun String.toUtf8ByteBuffer(): ByteBuffer {
    val byteArray = this.toUtf8Bytes()
    return ByteBuffer(java.nio.ByteBuffer.wrap(byteArray))
}
