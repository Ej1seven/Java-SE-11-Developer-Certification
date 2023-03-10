import com.WordyCompanyNAme.AlongPackageName.AClassWithAVeryLongName;

public class VarTest {
    public static void main(String[] args) {
        var aClassWithAVeryLongName = new AClassWithAVeryLongName();
        aClassWithAVeryLongName.setName("Testing");
        System.out.println(aClassWithAVeryLongName);

        // Invalid var declarations:

//// cannot use var declaration in a compound statement
//        var j = 0, k = 0;
//
//// again, cannot use var declaration in a compound statement
//        var m, n = 0;
//
//// Cannot declare a var variable without also initializing it
//        var someObject;
//
//// Cannot assign null to var variable, type cannot be inferred
//        var newvar = null;
//
//// Cannot use array initializer in var declaration/initialization
//        var myArray = {"A", "B"};
//
//// Cannot have an array of var
//        var[]newarray = new int[2];
    }
}
