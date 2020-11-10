package samid.com.expensemanager.presenter;

import com.echo.holographlibrary.Bar;

import java.util.ArrayList;
import java.util.List;

import samid.com.expensemanager.database.ExpenseDatabaseHelper;
import samid.com.expensemanager.model.Expense;
import samid.com.expensemanager.utils.ExpenseCollection;
import samid.com.expensemanager.utils.Util;
import samid.com.expensemanager.view.CurrentMonthExpenseView;


public class CurrentMonthExpensePresenter {
  private final CurrentMonthExpenseView view;
  private final ExpenseCollection expenseCollection;

  public CurrentMonthExpensePresenter(CurrentMonthExpenseView view, ExpenseDatabaseHelper database) {
    this.view = view;
    List<Expense> expenses = database.getExpensesForCurrentMonthGroupByCategory();
    expenseCollection = new ExpenseCollection(expenses);
  }

  public void plotGraph() {
    List<Bar> points = new ArrayList<Bar>();

    for (Expense expense : expenseCollection.withoutMoneyTransfer()) {
      Bar bar = new Bar();
      bar.setColor(view.getGraphColor());
      bar.setName(expense.getType());
      bar.setValue(expense.getAmount());
      //bar.setValueString(Util.latinNumberToPersian(String.valueOf(expense.getAmount())));
      System.out.println("getAmount====" + Util.latinNumberToPersian(String.valueOf(expense.getAmount())));
      System.out.println("getAmount====" + expense.getAmount());
      points.add(bar);
    }

    view.displayGraph(points);
  }

  public void showTotalExpense() {
    view.displayTotalExpense(expenseCollection.getTotalExpense());
  }
}
