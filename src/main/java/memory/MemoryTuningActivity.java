package memory;

import java.util.ArrayList;
import java.util.List;

public class MemoryTuningActivity {
    public static void main(String[] args) {
        List<DataHolder> dataHolderList = new ArrayList<>();

        while (true) {
            try {
                generateGarbage(dataHolderList);
                System.gc();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    private static void generateGarbage(List<DataHolder> dataHolderList) {
        for (int i = 0; i < 300; i++) {
            dataHolderList.add(new DataHolder(i));
        }

        // Simulate removing some objects to create garbage
        if (dataHolderList.size() > 10000) {
            for (int i = 0; i < 5000; i++) {
                dataHolderList.remove(0);
            }
        }
    }
}
