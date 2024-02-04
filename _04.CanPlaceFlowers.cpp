class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int N) {

        if (N == 0)
            return true;

        int n = flowerbed.size();
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (flowerbed[i] == 0) {

                int leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                int rightEmpty = (i == n - 1) || (flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    N = N-1;

                if(N==0) return true;
                }
            }
        }

        return N==0;
    }
};
