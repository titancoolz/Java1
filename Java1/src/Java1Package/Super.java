package Java1Package;

import java.time.Instant;

public class Super extends SuperSuper {
    public  long superValDefaultOVER;
    public  long superValInstanceInintOVER=superGetvalOVER();
    public  long superValConstructorMethodOVER;
    public  long superValInitailizerMethodOVER;
    public static long superValStaticBlockMethodOVER;
    public static long superValStaticDefaultOVER;
    public static long superValStaticInstanceInintOVER=superGetvalStaticOVER();
    public DummyClass superClassvarInstanceInintOVER=new DummyClass();
    public DummyClass superClassvarConstructorInitOVER;
    public DummyClass superClassvarDefaultOVER;
    public DummyClass superClassvarInitailizerInitOVER;
    public static DummyClass superClassvarStaticDefaultOVER;
    public static DummyClass superClassvarStaticBlockInitOVER;
    public static DummyClass superClassvarStaticInstanceInintOVER=new DummyClass();

    public  long superValDefault;
    public  long superValInstanceInint=superGetval();
    public  long superValConstructorMethod;
    public  long superValInitailizerMethod;
    public static long superValStaticBlockMethod;
    public static long superValStaticDefault;
    public static long superValStaticInstanceInint=superGetvalStatic();
    public DummyClass superClassvarInstanceInint=new DummyClass();
    public DummyClass superClassvarConstructorInit;
    public DummyClass superClassvarDefault;
    public DummyClass superClassvarInitailizerInit;
    public static DummyClass superClassvarStaticDefault;
    public static DummyClass superClassvarStaticBlockInit;
    public static DummyClass superClassvarStaticInstanceInint=new DummyClass();

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


     Super() {
//         super(2);
        System.out.println("Super Class constructor Start");
        superValConstructorMethod=superGetval();
        superClassvarConstructorInit=new DummyClass();
        superValConstructorMethodOVER=superGetvalOVER();
        superClassvarConstructorInitOVER=new DummyClass();


        superSuperValConstructorMethodOVER=superSuperGetvalOVER();
        superSuperClassvarConstructorInitOVER=new DummyClass();
    }

    {
        System.out.println("SuperSuper Class initalizer block Start");
        superValInitailizerMethod=superGetval();
        superClassvarInitailizerInit=new DummyClass();
        superValInitailizerMethodOVER=superGetvalOVER();
        superClassvarInitailizerInitOVER=new DummyClass();

        superSuperValInitailizerMethodOVER=superSuperGetvalOVER();
        superSuperClassvarInitailizerInitOVER=new DummyClass();

    }
    static{
        System.out.println("SuperSuper Class static block Start");
        superValStaticBlockMethod=superGetvalStatic();
        superValStaticBlockMethodOVER=superGetvalStaticOVER();
        superClassvarStaticBlockInit=new DummyClass();
        superClassvarStaticBlockInitOVER=new DummyClass();


        superSuperValStaticBlockMethodOVER =superSuperGetvalStaticOVER();
        superSuperClassvarStaticBlockInitOVER=new DummyClass();
    }



    public long superGetvalOVER()
    {
        System.out.println("superGetvalOVER from Super method called");return  Instant.now().getEpochSecond();
    }
    public long superGetval()
    {
        System.out.println("superGetval from Super method called");return  Instant.now().getEpochSecond();
    }
    public long superSuperGetvalOVER()
    {
        System.out.println("superSuperGetvalOVER from Super method called");return  Instant.now().getEpochSecond();
    }



    public static long superGetvalStaticOVER()
    {
        System.out.println("superGetvalStaticOVER from Super method called");return  Instant.now().getEpochSecond();
    }
    public static long superGetvalStatic()
    {
        System.out.println("superGetvalStatic from Super method called");return  Instant.now().getEpochSecond();
    }
    public static long superSuperGetvalStaticOVER()
    {
        System.out.println("superSuperGetvalStaticOVER from Super method called");return  Instant.now().getEpochSecond();
    }
}
