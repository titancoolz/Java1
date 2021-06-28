package Java1Package;

import java.time.Instant;

public class DummyClass {
    public static int dummyStaticVar=1;
    public static void dummyMethod()
    {System.out.println("dummyMethod called");}

    public  long dummyValDefault;
    public  long dummyValInstanceInint=dummyGetval();
    public  long dummyValConstructorMethod;
    public  long dummyValInitailizerMethod;
    public static long dummyValStaticBlockMethod;
    public static long dummyValStaticDefault;
    public static long dummyValStaticInstanceInint=dummyGetvalStatic();
    DummyClass()
    {
        System.out.println("dummy Class constructor called");
        dummyValConstructorMethod=dummyGetval();
    }
    {  System.out.println("Dummy Class initalizer block Start");
        dummyValInitailizerMethod=dummyGetval();}

    static{
        System.out.println("Dummy Class static block Start");
        dummyValStaticBlockMethod=dummyGetvalStatic();}

    public long dummyGetval()
    {
        System.out.println("dummyGetval from Dummy method called");return  Instant.now().getEpochSecond();
    }
    public static long dummyGetvalStatic()
    {
        System.out.println("dummyGetvalStatic from Dummy method called");return  Instant.now().getEpochSecond();
    }

}
