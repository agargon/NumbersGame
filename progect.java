
import java.util.Scanner;

//(1
//   احمد سعيد احمد جرغون:الاسم
//   120147552 :الرقم الجامعي 
public class progect {

    public static void main(String[] args) {
        //(2    يجب أن يقوم البرنامج بسؤال اللاعب عن اسمه عند بدء تشغيل المشروع وتخزين هذا الاسم لاستخدامه خلال مراحل اللعب مثال اسنت احمد    
        Scanner in = new Scanner(System.in);
        System.out.println("ما اسم اللاعب");
        String name=in.next();

        //(3
        //(4   : يجب أن يقوم البرنامج بطباعة قائمة لمستوى صعوبة اللعبة 
        //(5 يجب أن يسمح البرنامج للاعب باختيار مستوى الصعوبة  
//        for (int g = 0; g < 3; g++) {
        int a = 0;

        while (a != 3) {                                                        //التكرار البرنامج

            System.out.println("مستويات اللعبة");
            System.out.println("1) المستوي السهل\n 2) المستوي الصعب\n 3) خروج من اللعبة");

            
            //المستوى السهل
           // محاولات5  
            a = in.nextInt();
        if (a == 1) {
                        System.out.println("1) المستوي السهل");
                        System.out.println("(1-5) حزر الرقم من");
                int t = (int) (Math.random() * 100) + 1;                        //الرقم العشوائي
                int g=0;
        for (int i = 1; i <= 5; i++) {                                          ///for   /// 
                    g = in.nextInt();//القيمة المدخلة
                    if (g == t) {
                        System.out.println("انتهت اللعبة واللاعب فاز بتخمين الرقم");
                        break;
                    } else if (g >= 85 && g<101 ) {
                        System.out.println("قربت");
                    } else if ( g >=1 && g<85) {
                        System.out.println("ابعدت");
                    }else if (g>101){
                        System.out.println("ادخال خطأ");
                    }
                    
System.out.println("المحاولة"+i);       //يجب أن يقوم البرنامج بحساب عدد المحاولات التي قام بها اللاعب
                    }
            if (g!=t) {                                                       //  //عند انتهاء اللعبة وعدم تحقق الفوز
                System.out.println("انتهت اللعبةواللاعب لم يحقق الفوز ");
    
            }
        
             //المستوى الصعب   
            //محاولات10
        } else if (a == 2) {
                        System.out.println("2) المستوي الصعب");
                        System.out.println("(1-10) حزر الرقم من");              // ي    يقوم البرنامج بالطلب من اللاعب بتخمين الرقم الذي تم اختياره //6)  
                int w = (int) (Math.random() * 1000) + 1;//الرقم العشوائي
                int q=0;
        for (int e = 1; e <= 10; e++) {                                         ///for   /// 
                    q = in.nextInt();  //القيمة المدخلة
                    if (q == w) {
                         System.out.println("انتهت اللعبة واللاعب فاز بتخمين الرقم");
                         break;
                    } else if (q >= 800 && q<=1001 ) {
                         System.out.println("قربت");

                    } else if (q >= 1 && q<=800) {
                         System.out.println("ابعدت");
                    }else if (q>1001){
                         System.out.println("ادخال خطأ");
                    }
                        
System.out.println("المحاولة"+e);       //يجب أن يقوم البرنامج بحساب عدد المحاولات التي قام بها اللاعب
                }
              if (q!=w) {                                                                 //عند انتهاء اللعبة وعدم تحقق الفوز
                System.out.println("انتهت اللعبةواللاعب لم يحقق الفوز ");
    
            }
            //مستوى الخروج  
           // خروج3
        } else if (a == 3) {
            
                        System.out.println("3)(خروج) خروج من اللعبة");
                   } else {
                       System.out.println("خطا");
                   }
                   }
        
        
        
        
        
        
}
}
