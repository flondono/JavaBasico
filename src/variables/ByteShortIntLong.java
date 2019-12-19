package variables;

public class ByteShortIntLong {
    public static void main(String[] args) {

        byte mibyteMin = -128; //-129 un byte utiliza 8 bits
        byte miByteMax = 127; //128

        short miShortValorMin = -32768; //un short utiliza 16 bits
        short miShortValorMax = 32767;

        int miIntValorMin = -2147483648; // un int utiliza 32 bits
        int miIntValorMax = 2147483647;

        long myLongValorMin = -9223372036854775808L; //un long utiliza 64 bits
        long myLongValorMax = 9223372036854775807L;


    }

    public void mostrarInformacion() {
        System.out.println();
    }
}
