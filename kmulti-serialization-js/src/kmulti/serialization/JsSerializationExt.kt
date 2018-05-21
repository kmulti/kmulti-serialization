package kmulti.serialization

import kotlinx.io.ByteBuffer
import kotlinx.serialization.toUtf8Bytes

actual fun String.toUtf8ByteBuffer(): ByteBuffer {
    val byteArray = this.toUtf8Bytes()
    val byteBuffer = ByteBuffer.allocate(byteArray.size)
    return byteBuffer.put(byteArray)
}
