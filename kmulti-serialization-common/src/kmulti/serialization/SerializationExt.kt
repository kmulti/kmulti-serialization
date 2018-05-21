package kmulti.serialization

import kotlinx.io.ByteBuffer
import kotlinx.serialization.stringFromUtf8Bytes

expect fun String.toUtf8ByteBuffer(): ByteBuffer

fun ByteBuffer.fromUtf8BytesToString(): String = stringFromUtf8Bytes(array())
