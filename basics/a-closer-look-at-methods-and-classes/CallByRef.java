class TestObj1 {
    int a, b;

    TestObj1(int i, int j) {
        a = i;
        b = j;
    }

    void meth(TestObj1 o){
        o.a *= 2;
        o.b /= 2;
    }
}


public class CallByRef {
    public static void main(String[] args){
        TestObj1 ob = new TestObj1(15, 20);

        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}