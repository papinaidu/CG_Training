public class Main {
    static int peakBinarySort(int[] arr, int left, int right){
        int n = arr.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid == 0) {
                return (arr[0] >= arr[1]) ? 0 : 1;
            }

            if (mid == n - 1) {
                return (arr[n - 1] >= arr[n - 2]) ? n - 1 : n - 2;
            }

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 12, 12, 15, 18, 19};
        int left = 0;
        int right = arr.length - 1;
        int res = peakBinarySort(arr, left, right);
        System.out.println("Peak Index: " + res);
        System.out.println("Peak Element: " + arr[res]);
    }
}