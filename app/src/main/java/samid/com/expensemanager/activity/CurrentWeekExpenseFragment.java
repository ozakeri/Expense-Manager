package samid.com.expensemanager.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

import samid.com.expensemanager.R;
import samid.com.expensemanager.adapter.CurrentWeeksExpenseAdapter;
import samid.com.expensemanager.database.ExpenseDatabaseHelper;
import samid.com.expensemanager.model.Expense;
import samid.com.expensemanager.presenter.CurrentWeekExpensePresenter;
import samid.com.expensemanager.view.CurrentWeekExpenseView;

public class CurrentWeekExpenseFragment extends Fragment implements CurrentWeekExpenseView {

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    return inflater.inflate(R.layout.current_week_expenses, container, false);
  }

  @Override
  public void onActivityCreated(Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);

    ExpenseDatabaseHelper expenseDatabaseHelper = new ExpenseDatabaseHelper(getActivity());
    CurrentWeekExpensePresenter presenter = new CurrentWeekExpensePresenter(expenseDatabaseHelper, this);
    presenter.renderTotalExpenses();
    presenter.renderCurrentWeeksExpenses();
    expenseDatabaseHelper.close();
  }

  @Override
  public void displayCurrentWeeksExpenses(Map<String, List<Expense>> expensesByDate) {
    ExpandableListView listView = (ExpandableListView) getActivity().findViewById(R.id.current_week_expenses_list);
    listView.setAdapter(new CurrentWeeksExpenseAdapter(getActivity(), expensesByDate));
  }

  @Override
  public void displayTotalExpenses(Long totalExpense) {
    TextView totalExpenseTextBox = (TextView) getActivity().findViewById(R.id.current_week_expense);
    totalExpenseTextBox.setText(getString(R.string.total_expense) + " " + getString(R.string.rupee_sym) + totalExpense);
  }
}
