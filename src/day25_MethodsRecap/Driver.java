package day25_MethodsRecap;
/*
1. write a return method named getDriver1 that accepts
a string parameter called Browser
	if the browser name matches with {"chrome", "firefox", "id",
	"safari", "edge", "Opera"}, then it returns the name of
	that specific browser' driver
	Ex: getDriver("chrome");  ==> "Chrome Driver"
	getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of
				browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS

2. do the first task with multi-branch if statement instead of switch statement

	3. do the first task with ternaries instead of switch statements
 */
public class Driver {
    /*
    method declaration:
			Access modifier	 Specifier 	return-Type	  MethodName(parameter){
					statements;
			}
     */

    public static void main(String[] args) {

         //   getDriver1(); => argument is mandatory
     String str = getDriver1("ChromE");
        System.out.println(str);

        String str2 = getDriver2("chrome");
        System.out.println(str2);

        String str3 = getDriver3("firefox");
        System.out.println(str3);

    }

    public static String getDriver1(String browserName){
        String result = "";
    // also we can apply return methods to switch statement, instead of 'result' (LOOK AT THE getDriver2)
        switch (browserName.toLowerCase()){// "ChromE => chrome
            case "chrome": result = "Chrome Driver";
            break;

            case "firefox": result = "Firefox Driver";
            break;

            case "safari": result = "Safari Driver";
            break;

            case "opera": result = "Opera Driver";
            break;

            case "edge": result = "Edge Driver";
            break;

            default: result = "Invalid Driver";
        }

        return result;
    }

    public static String getDriver2 (String browserName){

      browserName = browserName.toLowerCase(); // to ignore case sensitivity

    //  String result = "";

        if (browserName.equals("chrome")){
        //    result = "Crhome Driver";
            return "Crhome Driver";
        } else if (browserName.equals("firefox")){
         //   result = "FireFox Driver";
            return "FireFox Driver";
        } else if (browserName.equals("safari")){
        //    result = "Safari Driver";
            return "Safari Driver";
        } else if (browserName.equals("edge")){
         //   result = "Edge Driver";
            return "Edge Driver";
        } else if (browserName.equals("opera")){
         //   result = "Opera Driver";
            return "Opera Driver";
        } else {
          //  result = "Invalid Driver";
            return "Invalid Driver";
        }

    }

    public static String getDriver3 (String browserName){
        browserName = browserName.toLowerCase();

    // => also we can apply return method instead of 'result'

        // String result =
       return (browserName.equals("chrome")) ? "Chrome Driver" :
                (browserName.equals("firefox")) ? "FireFox Driver" :
                        (browserName.equals("safari")) ? "Safari Driver" :
                                (browserName.equals("edge")) ? "Edge Driver" :
                                        (browserName.equals("opera")) ? "Opera Driver" :
                                                "Invalid Driver";


    }

}
