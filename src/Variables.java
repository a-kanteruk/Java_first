public class Variables {

    public static void main(String[] args) {
        int minInteger = Integer.MIN_VALUE;
        int maxInteger = Integer.MAX_VALUE;
        int minShort = Short.MIN_VALUE;
        int maxShort = Short.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        int minByte = Byte.MIN_VALUE;
        int maxByte = Byte.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;
        boolean maxBoolean = Boolean.TRUE;
        boolean minBoolean = Boolean.FALSE;
        String word = "Hello Java!";
        char[] massive = {'j','d','k'};

        System.out.println(minInteger);
        System.out.println(maxInteger);
        System.out.println(minShort);
        System.out.println(maxShort);
        System.out.println(minLong);
        System.out.println(maxLong);
        System.out.println(minByte);
        System.out.println(maxByte);
        System.out.println(minFloat);
        System.out.println(maxFloat);
        System.out.println(minDouble);
        System.out.println(maxDouble);
        System.out.println(minChar);
        System.out.println(maxChar);
        System.out.println(maxBoolean);
        System.out.println(minBoolean);
        System.out.println(word);
        for (int i = 0; i < massive.length; i++){
            System.out.println(massive[i]);
        }

    }
}
