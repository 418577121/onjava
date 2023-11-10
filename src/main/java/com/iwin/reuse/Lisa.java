package com.iwin.reuse;

class Lisa extends Homer {
    // 不能编译
    // @Override
        void doh(Milhouse m) {
            System.out.println("doh(Milhouse)");
    }
}

