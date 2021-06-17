package Box_extends;

 class Box_1 {
      private float width;
        private float height;
        private float depth;
        //сконструировать клон объекта
        Box_1(Box_1 ob) {//передать объект конструктору
            width = ob.width;
            height = ob.height;
            depth = ob.depth;
        }
        //конструктор, применяемый при указании всех размеров
        Box_1(float width, float height, float depth) {
            this.width = width;
            this.height = height;
            this.depth = depth;
        }
        //конструктор, применяемый при отсутствии размеров
        Box_1() {
            width =-1;//-1 служит для обозначения неинициализированного параллелепипеда
                    height = - 1;
            depth = - 1;
        }
        //конструктор, применяемый при создании куба
        Box_1(float len) {width = height = depth = len;}
        //расчет объема
        float volume() {return width * height * depth;}
    }

