package com.esentri.order.excel.generator;

class Order {

    private final Company company;
    private final Department department;
    private final Article article;
    private final int amount;

    Order(Company company, Department department, Article article, int amount) {
        this.company = company;
        this.department = department;
        this.article = article;
        this.amount = amount;
    }

    Company getCompany() {
        return company;
    }

    Department getDepartment() {
        return department;
    }

    Article getArticle() {
        return article;
    }

    int getAmount() {
        return amount;
    }
}
