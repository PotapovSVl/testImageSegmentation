package com.company;

/**
 * хранит данные о каждом пикселе
 *
 * @param //row  //номер строки в изображении
 * @param //col   номер столбца
 * @param //value хранит вес изображения
 */
public class Pixel {
    //строка - индекс на изображении
    private int row;

    // столбец - индекс на изображении
    private int col;

    //вес пикселя ( в виде яркости предположительно)
    private int value;

    //красный канал
    private int red;

    //зеленый канал
    private int green;
    //синий канал
    private int blue;
    //private int weight;


    //возвращает номер строки
    public int row() {
        return this.row;
    }

    //возвращает номер столбца
    public int col() {
        return this.col;
    }

    //возвращает вес пикселя
    public int value() {
        return this.value;
    }

    //возвращает красный канал
    public int red() {
        return this.red;
    }
//возвращает зеленый канал
    public int green() {
        return this.green;
    }

//возвращает синий канал
    public int blue() {
        return this.blue;
    }


}
