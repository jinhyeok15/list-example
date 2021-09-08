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
        List<Integer> indexSet = indexListCreator(10);
        List<SampleObj> data = new ArrayList<>();

        // case1: Not use indexCreator and create constructor before for loop.
        SampleObj sampleObj = new SampleObj();
        for (int index : indexSet) {
            sampleObj.setIndex(index);
            sampleObj.setGrade("grade "+(index%3+1));
            sampleObj.setName("name"+(index%3+1));

            data.add(sampleObj);
        }
        for(SampleObj obj : data)
            System.out.println(obj.toString());

    }
}
