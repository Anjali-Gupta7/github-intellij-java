public class Strings {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Tony");
//        System.out.println(sb);
//
//        //char at index 0
//        System.out.println(sb.charAt(0));
//
//        //set char at index 0
//        sb.setCharAt(0,'P');
//        System.out.println(sb);
//
//        //insert function
//        sb.insert(0,'S');
//        System.out.println(sb);
//
//        sb.insert(2,'n');
//        System.out.println(sb);
//
//        //delete the extra 'n'
//        sb.delete(2,3);
//        System.out.println(sb);
//
//        sb.delete(2,4);
//        System.out.println(sb);
//
//        StringBuilder sb1 = new StringBuilder("h");
//        sb1.append("e");
//        sb1.append("l");
//        sb1.append("l");
//        sb1.append("o");
//        System.out.println(sb1);
//
//        System.out.println(sb1.length());

        StringBuilder sb2 = new StringBuilder("hello");

        for (int i=0; i < sb2.length()/2; i++){
            int front = i;
            int back = sb2.length() -1 -i; //5-1-0 => 4

            char frontChar = sb2.charAt(front);
            char backChar = sb2.charAt(back);

            sb2.setCharAt(front,backChar);
            sb2.setCharAt(back,frontChar);
        }
        System.out.println(sb2);
    }
}
