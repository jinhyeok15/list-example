import java.util.ArrayList;
import java.util.List;

public class ListExample {
    private static SampleObj indexCreator(int index) {
        SampleObj sampleObj = new SampleObj();
        sampleObj.setIndex(index);
        return sampleObj;
    }

    private static List<Integer> indexListCreator(int n) {
        List<Integer> intSet = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            intSet.add(i);
        }
        return intSet;
    }

    public static void main(String[] args) {
        List<Integer> indexSet = indexListCreator(4);
        List<SampleObj> data1 = new ArrayList<>();
        List<SampleObj> data2 = new ArrayList<>();
        List<SampleObj> data3 = new ArrayList<>();
        List<SingletonObj> data4 = new ArrayList<>();

        // case1: Not use indexCreator and create constructor before for loop.
        System.out.println("case1");

        SampleObj sampleObj1 = new SampleObj();
        for (int index : indexSet) {
            sampleObj1.setIndex(index);
            sampleObj1.setGrade("grade "+(index%3+1));
            sampleObj1.setName("name"+index);

            data1.add(sampleObj1);
        }
        for(SampleObj obj : data1)
            System.out.println(obj.toString());
        System.out.println("<--          -->");

        // case2: Not use indexCreator and create constructor after for loop
        System.out.println("case2");

        for (int index : indexSet) {
            SampleObj sampleObj2 = new SampleObj();
            sampleObj2.setIndex(index);
            sampleObj2.setName("name"+index);
            sampleObj2.setGrade("grade "+(index%3+1));

            data2.add(sampleObj2);
        }

        for(SampleObj obj : data2)
            System.out.println(obj.toString());
        System.out.println("<--          -->");

        // case3: Use indexCreator
        System.out.println("case3");

        for (int index : indexSet) {
            SampleObj sampleObj3 = indexCreator(index);
            sampleObj3.setName("name"+index);
            sampleObj3.setGrade("grade "+(index%3+1));

            data3.add(sampleObj3);
        }

        for(SampleObj obj : data3)
            System.out.println(obj.toString());
        System.out.println("<--          -->");

        // case4: Use Singleton
        System.out.println("case4");

        for (int index : indexSet) {
            SingletonObj singletonObj = SingletonObj.getInstance();
            singletonObj.setIndex(index);
            singletonObj.setName("name"+index);
            singletonObj.setGrade("grade "+(index%3+1));

            data4.add(singletonObj);
        }

        for(SingletonObj obj : data4)
            System.out.println(obj.toString());
        System.out.println("<--          -->");
    }
}
