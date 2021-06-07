package jbg.kzy.everytest.lombok;

/**
 * Test Lombok efficiency
 *
 * @author ckh
 * @since 2021/1/4.
 */
public class DemoClass {
    private String data1;
    private String data2;
    private String data3;
    private String data4;
    private String data5;
    private String data6;
    private String data7;
    private String data8;
    private String data9;
    private Long long1;
    private Long long2;
    private Long long3;
    private Long long4;
    private Long long5;
    private Long long6;
    private Long long7;
    private Long long8;
    private Long long9;

    public DemoClass(String data1, String data2, String data3, String data4, String data5, String data6, String data7, String data8, String data9, Long long1, Long long2, Long long3, Long long4, Long long5, Long long6, Long long7, Long long8, Long long9) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
        this.data6 = data6;
        this.data7 = data7;
        this.data8 = data8;
        this.data9 = data9;
        this.long1 = long1;
        this.long2 = long2;
        this.long3 = long3;
        this.long4 = long4;
        this.long5 = long5;
        this.long6 = long6;
        this.long7 = long7;
        this.long8 = long8;
        this.long9 = long9;
    }

    public DemoClass() {
    }

    public static DemoClassBuilder builder() {
        return new DemoClassBuilder();
    }

    public String getData1() {
        return this.data1;
    }

    public String getData2() {
        return this.data2;
    }

    public String getData3() {
        return this.data3;
    }

    public String getData4() {
        return this.data4;
    }

    public String getData5() {
        return this.data5;
    }

    public String getData6() {
        return this.data6;
    }

    public String getData7() {
        return this.data7;
    }

    public String getData8() {
        return this.data8;
    }

    public String getData9() {
        return this.data9;
    }

    public Long getLong1() {
        return this.long1;
    }

    public Long getLong2() {
        return this.long2;
    }

    public Long getLong3() {
        return this.long3;
    }

    public Long getLong4() {
        return this.long4;
    }

    public Long getLong5() {
        return this.long5;
    }

    public Long getLong6() {
        return this.long6;
    }

    public Long getLong7() {
        return this.long7;
    }

    public Long getLong8() {
        return this.long8;
    }

    public Long getLong9() {
        return this.long9;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public void setData3(String data3) {
        this.data3 = data3;
    }

    public void setData4(String data4) {
        this.data4 = data4;
    }

    public void setData5(String data5) {
        this.data5 = data5;
    }

    public void setData6(String data6) {
        this.data6 = data6;
    }

    public void setData7(String data7) {
        this.data7 = data7;
    }

    public void setData8(String data8) {
        this.data8 = data8;
    }

    public void setData9(String data9) {
        this.data9 = data9;
    }

    public void setLong1(Long long1) {
        this.long1 = long1;
    }

    public void setLong2(Long long2) {
        this.long2 = long2;
    }

    public void setLong3(Long long3) {
        this.long3 = long3;
    }

    public void setLong4(Long long4) {
        this.long4 = long4;
    }

    public void setLong5(Long long5) {
        this.long5 = long5;
    }

    public void setLong6(Long long6) {
        this.long6 = long6;
    }

    public void setLong7(Long long7) {
        this.long7 = long7;
    }

    public void setLong8(Long long8) {
        this.long8 = long8;
    }

    public void setLong9(Long long9) {
        this.long9 = long9;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DemoClass)) return false;
        final DemoClass other = (DemoClass) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$data1 = this.getData1();
        final Object other$data1 = other.getData1();
        if (this$data1 == null ? other$data1 != null : !this$data1.equals(other$data1)) return false;
        final Object this$data2 = this.getData2();
        final Object other$data2 = other.getData2();
        if (this$data2 == null ? other$data2 != null : !this$data2.equals(other$data2)) return false;
        final Object this$data3 = this.getData3();
        final Object other$data3 = other.getData3();
        if (this$data3 == null ? other$data3 != null : !this$data3.equals(other$data3)) return false;
        final Object this$data4 = this.getData4();
        final Object other$data4 = other.getData4();
        if (this$data4 == null ? other$data4 != null : !this$data4.equals(other$data4)) return false;
        final Object this$data5 = this.getData5();
        final Object other$data5 = other.getData5();
        if (this$data5 == null ? other$data5 != null : !this$data5.equals(other$data5)) return false;
        final Object this$data6 = this.getData6();
        final Object other$data6 = other.getData6();
        if (this$data6 == null ? other$data6 != null : !this$data6.equals(other$data6)) return false;
        final Object this$data7 = this.getData7();
        final Object other$data7 = other.getData7();
        if (this$data7 == null ? other$data7 != null : !this$data7.equals(other$data7)) return false;
        final Object this$data8 = this.getData8();
        final Object other$data8 = other.getData8();
        if (this$data8 == null ? other$data8 != null : !this$data8.equals(other$data8)) return false;
        final Object this$data9 = this.getData9();
        final Object other$data9 = other.getData9();
        if (this$data9 == null ? other$data9 != null : !this$data9.equals(other$data9)) return false;
        final Object this$long1 = this.getLong1();
        final Object other$long1 = other.getLong1();
        if (this$long1 == null ? other$long1 != null : !this$long1.equals(other$long1)) return false;
        final Object this$long2 = this.getLong2();
        final Object other$long2 = other.getLong2();
        if (this$long2 == null ? other$long2 != null : !this$long2.equals(other$long2)) return false;
        final Object this$long3 = this.getLong3();
        final Object other$long3 = other.getLong3();
        if (this$long3 == null ? other$long3 != null : !this$long3.equals(other$long3)) return false;
        final Object this$long4 = this.getLong4();
        final Object other$long4 = other.getLong4();
        if (this$long4 == null ? other$long4 != null : !this$long4.equals(other$long4)) return false;
        final Object this$long5 = this.getLong5();
        final Object other$long5 = other.getLong5();
        if (this$long5 == null ? other$long5 != null : !this$long5.equals(other$long5)) return false;
        final Object this$long6 = this.getLong6();
        final Object other$long6 = other.getLong6();
        if (this$long6 == null ? other$long6 != null : !this$long6.equals(other$long6)) return false;
        final Object this$long7 = this.getLong7();
        final Object other$long7 = other.getLong7();
        if (this$long7 == null ? other$long7 != null : !this$long7.equals(other$long7)) return false;
        final Object this$long8 = this.getLong8();
        final Object other$long8 = other.getLong8();
        if (this$long8 == null ? other$long8 != null : !this$long8.equals(other$long8)) return false;
        final Object this$long9 = this.getLong9();
        final Object other$long9 = other.getLong9();
        if (this$long9 == null ? other$long9 != null : !this$long9.equals(other$long9)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DemoClass;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $data1 = this.getData1();
        result = result * PRIME + ($data1 == null ? 43 : $data1.hashCode());
        final Object $data2 = this.getData2();
        result = result * PRIME + ($data2 == null ? 43 : $data2.hashCode());
        final Object $data3 = this.getData3();
        result = result * PRIME + ($data3 == null ? 43 : $data3.hashCode());
        final Object $data4 = this.getData4();
        result = result * PRIME + ($data4 == null ? 43 : $data4.hashCode());
        final Object $data5 = this.getData5();
        result = result * PRIME + ($data5 == null ? 43 : $data5.hashCode());
        final Object $data6 = this.getData6();
        result = result * PRIME + ($data6 == null ? 43 : $data6.hashCode());
        final Object $data7 = this.getData7();
        result = result * PRIME + ($data7 == null ? 43 : $data7.hashCode());
        final Object $data8 = this.getData8();
        result = result * PRIME + ($data8 == null ? 43 : $data8.hashCode());
        final Object $data9 = this.getData9();
        result = result * PRIME + ($data9 == null ? 43 : $data9.hashCode());
        final Object $long1 = this.getLong1();
        result = result * PRIME + ($long1 == null ? 43 : $long1.hashCode());
        final Object $long2 = this.getLong2();
        result = result * PRIME + ($long2 == null ? 43 : $long2.hashCode());
        final Object $long3 = this.getLong3();
        result = result * PRIME + ($long3 == null ? 43 : $long3.hashCode());
        final Object $long4 = this.getLong4();
        result = result * PRIME + ($long4 == null ? 43 : $long4.hashCode());
        final Object $long5 = this.getLong5();
        result = result * PRIME + ($long5 == null ? 43 : $long5.hashCode());
        final Object $long6 = this.getLong6();
        result = result * PRIME + ($long6 == null ? 43 : $long6.hashCode());
        final Object $long7 = this.getLong7();
        result = result * PRIME + ($long7 == null ? 43 : $long7.hashCode());
        final Object $long8 = this.getLong8();
        result = result * PRIME + ($long8 == null ? 43 : $long8.hashCode());
        final Object $long9 = this.getLong9();
        result = result * PRIME + ($long9 == null ? 43 : $long9.hashCode());
        return result;
    }

    public String toString() {
        return "DemoClass(data1=" + this.getData1() + ", data2=" + this.getData2() + ", data3=" + this.getData3() + ", data4=" + this.getData4() + ", data5=" + this.getData5() + ", data6=" + this.getData6() + ", data7=" + this.getData7() + ", data8=" + this.getData8() + ", data9=" + this.getData9() + ", long1=" + this.getLong1() + ", long2=" + this.getLong2() + ", long3=" + this.getLong3() + ", long4=" + this.getLong4() + ", long5=" + this.getLong5() + ", long6=" + this.getLong6() + ", long7=" + this.getLong7() + ", long8=" + this.getLong8() + ", long9=" + this.getLong9() + ")";
    }

    public static class DemoClassBuilder {
        private String data1;
        private String data2;
        private String data3;
        private String data4;
        private String data5;
        private String data6;
        private String data7;
        private String data8;
        private String data9;
        private Long long1;
        private Long long2;
        private Long long3;
        private Long long4;
        private Long long5;
        private Long long6;
        private Long long7;
        private Long long8;
        private Long long9;

        DemoClassBuilder() {
        }

        public DemoClassBuilder data1(String data1) {
            this.data1 = data1;
            return this;
        }

        public DemoClassBuilder data2(String data2) {
            this.data2 = data2;
            return this;
        }

        public DemoClassBuilder data3(String data3) {
            this.data3 = data3;
            return this;
        }

        public DemoClassBuilder data4(String data4) {
            this.data4 = data4;
            return this;
        }

        public DemoClassBuilder data5(String data5) {
            this.data5 = data5;
            return this;
        }

        public DemoClassBuilder data6(String data6) {
            this.data6 = data6;
            return this;
        }

        public DemoClassBuilder data7(String data7) {
            this.data7 = data7;
            return this;
        }

        public DemoClassBuilder data8(String data8) {
            this.data8 = data8;
            return this;
        }

        public DemoClassBuilder data9(String data9) {
            this.data9 = data9;
            return this;
        }

        public DemoClassBuilder long1(Long long1) {
            this.long1 = long1;
            return this;
        }

        public DemoClassBuilder long2(Long long2) {
            this.long2 = long2;
            return this;
        }

        public DemoClassBuilder long3(Long long3) {
            this.long3 = long3;
            return this;
        }

        public DemoClassBuilder long4(Long long4) {
            this.long4 = long4;
            return this;
        }

        public DemoClassBuilder long5(Long long5) {
            this.long5 = long5;
            return this;
        }

        public DemoClassBuilder long6(Long long6) {
            this.long6 = long6;
            return this;
        }

        public DemoClassBuilder long7(Long long7) {
            this.long7 = long7;
            return this;
        }

        public DemoClassBuilder long8(Long long8) {
            this.long8 = long8;
            return this;
        }

        public DemoClassBuilder long9(Long long9) {
            this.long9 = long9;
            return this;
        }

        public DemoClass build() {
            return new DemoClass(data1, data2, data3, data4, data5, data6, data7, data8, data9, long1, long2, long3, long4, long5, long6, long7, long8, long9);
        }

        public String toString() {
            return "DemoClass.DemoClassBuilder(data1=" + this.data1 + ", data2=" + this.data2 + ", data3=" + this.data3 + ", data4=" + this.data4 + ", data5=" + this.data5 + ", data6=" + this.data6 + ", data7=" + this.data7 + ", data8=" + this.data8 + ", data9=" + this.data9 + ", long1=" + this.long1 + ", long2=" + this.long2 + ", long3=" + this.long3 + ", long4=" + this.long4 + ", long5=" + this.long5 + ", long6=" + this.long6 + ", long7=" + this.long7 + ", long8=" + this.long8 + ", long9=" + this.long9 + ")";
        }
    }
}
