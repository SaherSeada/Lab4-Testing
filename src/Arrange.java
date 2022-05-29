
public class Arrange {
    int[] arrange(int[] array) {
        int t = 0;
        int temp = 0;
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] == 3) {
                t = i-1;
                while(array[t] != 3 && t > 0) {
                    temp = array[t];
                    array[t] = array[t+1];
                    array[t+1] = temp;
                    t--;
                }
                continue;
            }

            if(array[i] > array[i+1]) {
                t = i+1;
                while(t>0 && array[t] < array[t-1]) {
                    if(array[t] == 3) {
                        break;
                    }
                    temp = array[t];
                    array[t] = array[t-1];
                    array[t-1] = temp;
                    t--;
                }
            }
        }
        return array;
    }

}
