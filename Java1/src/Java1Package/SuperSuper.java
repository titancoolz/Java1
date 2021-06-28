package Java1Package;

import java.time.Instant;
public class SuperSuper {

    public  long superSuperValDefault;
    public  long superSuperValInstanceInint=superSuperGetval();
    public  long superSuperValConstructorMethod;
    public  long superSuperValInitailizerMethod;
    public static long superSuperValStaticBlockMethod;
    public static long superSuperValStaticDefault;
    public static long superSuperValStaticInstanceInint=superSuperGetvalStatic();
    public DummyClass superSuperClassvarInstanceInint=new DummyClass();
    public DummyClass superSuperClassvarConstructorInit;
    public DummyClass superSuperClassvarDefault;
    public DummyClass superSuperClassvarInitailizerInit;
    public static DummyClass superSuperClassvarStaticDefault;
    public static DummyClass superSuperClassvarStaticBlockInit;
    public static DummyClass superSuperClassvarStaticInstanceInint=new DummyClass();
    
    public  long superSuperValDefaultOVER;
    public  long superSuperValInstanceInintOVER=superSuperGetvalOVER();
    public  long superSuperValConstructorMethodOVER;
    public  long superSuperValInitailizerMethodOVER;
    public static long superSuperValStaticBlockMethodOVER;
    public static long superSuperValStaticDefaultOVER;
    public static long superSuperValStaticInstanceInintOVER=superSuperGetvalStaticOVER();
    public DummyClass superSuperClassvarInstanceInintOVER=new DummyClass();
    public DummyClass superSuperClassvarConstructorInitOVER;
    public DummyClass superSuperClassvarDefaultOVER;
    public DummyClass superSuperClassvarInitailizerInitOVER;
    public static DummyClass superSuperClassvarStaticDefaultOVER;
    public static DummyClass superSuperClassvarStaticBlockInitOVER;
    public static DummyClass superSuperClassvarStaticInstanceInintOVER=new DummyClass();
    SuperSuper()
    {
        System.out.println("SuperSuper Class constructor Start");
        superSuperValConstructorMethod=superSuperGetval();
        superSuperClassvarConstructorInit=new DummyClass();
        superSuperValConstructorMethodOVER=superSuperGetvalOVER();
        superSuperClassvarConstructorInitOVER=new DummyClass();


    }
    {
        System.out.println("SuperSuper Class initalizer block Start");
        superSuperValInitailizerMethod=superSuperGetval();
        superSuperClassvarInitailizerInit=new DummyClass();
        superSuperValInitailizerMethodOVER=superSuperGetvalOVER();
        superSuperClassvarInitailizerInitOVER=new DummyClass();

    }
    static{
        System.out.println("SuperSuper Class static block Start");
        superSuperValStaticBlockMethod=superSuperGetvalStatic();
        superSuperValStaticBlockMethodOVER =superSuperGetvalStaticOVER();
        superSuperClassvarStaticBlockInit=new DummyClass();
        superSuperClassvarStaticBlockInitOVER=new DummyClass();
    }
public long superSuperGetval()
{
    System.out.println("superSuperGetval from SuperSuper method called");
    return  Instant.now().getEpochSecond();
}
public long superSuperGetvalOVER()
{
    System.out.println("superSuperGetvalOVER from SuperSuper method called");return  Instant.now().getEpochSecond();
}

public static long superSuperGetvalStatic()
{
    System.out.println("superSuperGetvalStatic from SuperSuper method called");return  Instant.now().getEpochSecond();
}
public static long superSuperGetvalStaticOVER()
{
    System.out.println("superSuperGetvalStaticOVER from SuperSuper method called");return  Instant.now().getEpochSecond();
}
}
