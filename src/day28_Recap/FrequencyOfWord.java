package day28_Recap;

public class FrequencyOfWord {
    public static void main(String[] args) {
        /*
        1. write a program return the frequency of a word from a string
			ex:
				str = "JavajavaJAVA";
				word = "java";
				output:
					3
    do not use same the approach we did in
    last office hour
         */
        String str = "JavaxxJavAnjAVAnJAVA".toLowerCase();
                   // 0123456789......
        //substring(0,4) ==> Java
        //substring(1,5) ==> avax
        //substring(2,6) ==> vaxx
        //substring(3,7) ==> axxJ //bu sekilde devam eder



         int count = 0;
        for(int i = 0; i <= str.length()-4; i++){ // aradigimiz kelime kac indexliyse onun sayisini cikariyoruz

            String s = str.substring(i, i+4);
            if(s.equals("java")){
                count++;
            }

        }
        System.out.println(count);


    }
}
