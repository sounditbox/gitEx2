package com.company;

public class Main {

    public static void main(String[] args) {
	    Counter c = new Counter();
        System.out.println(c.getCount());
    }
}


// untracked - красные - не отслеживаемые файлы. (git add .) чтобы добавить их все
// ignored - жёлтые - игнорируемые. (список лежит в .gitgnore)

// new - зелёные - новые
// changed - лазурные - изменённые
// deleted - удалённые

// init - создание репозитория
// add - добавление неотслеживаемых файлов
// checkout - переключиться между ветками
// branch - новая ветка
// merge - слияние веток