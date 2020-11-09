package samid.com.expensemanager.view;

import java.util.List;

import samid.com.expensemanager.model.Expense;

public interface TodaysExpenseView {
  void displayTotalExpense(Long totalExpense);
  void displayTodaysExpenses(List<Expense> expenses);
}
