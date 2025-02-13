package org.example.lesson_2

fun main() {

    val currentStaff: Int = 50
    val currentStaffOfInterns: Int = 30
    val employeeSalaries: Int = 30000
    val salaryOfInterns: Int = 20000
    val employeeExpenses: Int
    val salaryExpenses: Int
    val avarageSalaryOfEmployee: Int

    employeeExpenses = currentStaff * employeeSalaries
    salaryExpenses = employeeExpenses + currentStaffOfInterns * salaryOfInterns
    avarageSalaryOfEmployee = (employeeExpenses + currentStaffOfInterns * salaryOfInterns) / (currentStaff + currentStaffOfInterns)

    println("Расходы на выплату зарплаты постоянных сотрудников: ${employeeExpenses}")
    println("Общие расходы по ЗП: ${salaryExpenses}")
    println("Средняя ЗП одного сотрудника: ${avarageSalaryOfEmployee}")

}