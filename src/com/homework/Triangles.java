package com.homework;

public class Triangles {
    private float l;
    private int h;


    public Triangles(float l) {
        this.l = l;
        this.h = Math.round(l / 2);
    }

    public void a_empty() {
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= l - i + 1; j++) {
                if (j == 1 || i == 1 || j == l - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void a_full() {
        for (int i = 1; i <= l; i++) {
            for (int j = 0; j < l - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void b_empty() {

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                if (i == h || j == h - i + 1 || j == h + i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    public void b_full() {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                if (i == h || j >= h - i + 1 && j <= h + i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public void c_empty() {
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= l; j++) {
                if (i == 1 || j == i || j == l) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void c_full() {
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= l; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public void d_empty() {
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == l || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void d_full() {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void e_empty() {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                if (i == 1 || j == i || j == l - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void e_full() {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                if (i == 0 || j >= i && j <= l - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void f_empty() {
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= l; j++) {
                if (i == l || j == l || j == l - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public void f_full() {
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= l; j++) {
                if (i == l || j <= l && j >= l - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void g_empty() {
        int t = h;
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= h; j++) {
                if (j == t || j == h) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            if(i < h){
                t--;
            } else{
                t++;
            }
            System.out.println();
        }

    }

    public void g_full() {
        int t = h;
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= h; j++) {
                if (j >= t) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            if(i < h){
                t--;
            } else{
                t++;
            }
            System.out.println();
        }
    }

    public void h_empty() {
        int t = 1;
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= t; j++) {
                if (j == 1 || j == t) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            if (i < h) {
                t++;
            } else {
                t--;
            }
        }
    }

    public void h_full() {
        int t = 1;
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= t; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if (i < h) {
                t++;
            } else {
                t--;
            }
        }
    }

}
