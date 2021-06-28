package Java1Package;

import java.time.Instant;

public class Sub extends Super {


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


    public  long ValDefault;
    public  long ValInstanceInint=Getval();
    public  long ValConstructorMethod;
    public  long ValInitailizerMethod;
    public static long ValStaticBlockMethod;
    public static long ValStaticDefault;
    public static long ValStaticInstanceInint=GetvalStatic();
    public DummyClass ClassvarInstanceInint=new DummyClass();
    public DummyClass ClassvarConstructorInit;
    public DummyClass ClassvarDefault;
    public DummyClass ClassvarInitailizerInit;
    public static DummyClass ClassvarStaticDefault;
    public static DummyClass ClassvarStaticBlockInit;
    public static DummyClass ClassvarStaticInstanceInint=new DummyClass();

    public int parameterConstructor;
    public int parameterInitalizerBlock;

     Sub(int a) {

        System.out.println("Sub Class constructor Start");
         parameterConstructor=a;
        ValConstructorMethod=Getval();
        ClassvarConstructorInit=new DummyClass();


        superValConstructorMethodOVER=superGetvalOVER();
        superClassvarConstructorInitOVER=new DummyClass();
    }

    {
        parameterInitalizerBlock=parameterConstructor;
        System.out.println("Sub Class initalizer block Start");
        ValInitailizerMethod=Getval();
        ClassvarInitailizerInit=new DummyClass();

        superValInitailizerMethodOVER=superGetvalOVER();
        superClassvarInitailizerInitOVER=new DummyClass();

    }
    static{
        System.out.println("Sub Class static block Start");
        ValStaticBlockMethod=GetvalStatic();
        ClassvarStaticBlockInit=new DummyClass();


        superValStaticBlockMethodOVER =superGetvalStaticOVER();
        superClassvarStaticBlockInitOVER=new DummyClass();
    }


    public long superGetvalOVER()
    {
        System.out.println("superGetvalOVER from Sub method called");return  Instant.now().getEpochSecond();
    }
    public long Getval()
    {
        System.out.println("Getval from Sub method called");return  Instant.now().getEpochSecond();
    }
    public static long superGetvalStaticOVER()
    {
        System.out.println("superGetvalStaticOVER from Sub method called");return  Instant.now().getEpochSecond();
    }
    public static long GetvalStatic()
    {
        System.out.println("GetvalStatic from Sub method called");return  Instant.now().getEpochSecond();
    }
   /* public long superSuperGetvalOVER()
    {
        System.out.println("superSuperGetvalOVER from Super method called");return  Instant.now().getEpochSecond();
    }*/



}
