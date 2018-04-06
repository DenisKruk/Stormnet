package com.company;

public class GetMinMax {

    private int min;
    private int max;

    public void getMinAndMax(int min, int max) {
        this.min = min;
        this.max = max;
    }

        public int getMin () {
            return min;
        }

        public int getMax () {
            return max;
        }

    public MinAndMax getMinAndMax(int[] array) {
        int min = 3;
        int max = 6;
        return new MinAndMax(min, max);
    }

    MinAndMax minAndMax = getMinAndMax(new int[]{1, 2, 3, 4, 5});

    private class MinAndMax {
        public MinAndMax(int min, int max) {
            MinAndMax getMin;
            MinAndMax getMax;
        }
    }

    }

