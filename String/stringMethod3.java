public class stringMethod3 {
    public static void main(String args[]) {
        char ch[] = { 'n', 'e', 't', 'b', 'e', 'a', 'n', 's' };
        String str = new String(ch);
        System.out.println(ch);

        // Methods of string class

        int length = str.length();
        int find;
        String str1, str2, str3, str4, str5, str6, str7, str8;
        str1 = str.toUpperCase(); // It will create a new object of the string literals in heap memory.
        str2 = str1.toLowerCase();
        str3 = str.trim();
        str4 = str.substring(3); // beans
        str5 = str.substring(2, 6); // tbea
        str6 = str.repeat(5);
        str7 = str.replace('t', 'n');
        boolean bn;
        bn = str.startsWith("n");
        boolean b;
        b = str.startsWith(str);
        int index;
        char value;
        value = str.charAt(5);
        index = str.indexOf("b");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(value);
        System.out.println(bn);
        find = str.indexOf('b');
        System.out.println(find);
        find = str.lastIndexOf(str);
        System.out.println(find);
        bn = str.endsWith("s");
        System.out.println(bn);

        // Print all the character of the string str using loop.

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

        String st = "www.udemy.co.in";
        int ind;
        ind = st.indexOf(".", 10);
        System.out.println('\n');
        System.out.println(ind);
        bn = st.startsWith("ud", 4);
        System.out.println(bn);
        ind = st.lastIndexOf(".", 8);
        System.out.println(ind);

    }
}
