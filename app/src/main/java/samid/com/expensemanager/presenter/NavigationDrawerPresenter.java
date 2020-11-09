package samid.com.expensemanager.presenter;

import samid.com.expensemanager.activity.CurrentMonthExpenseFragment;
import samid.com.expensemanager.activity.CurrentWeekExpenseFragment;
import samid.com.expensemanager.view.NavigationDrawerItemView;

public class NavigationDrawerPresenter {

  public static final String THIS_WEEK = "این هفته";
  public static final String THIS_MONTH = "این ماه";
  public static final String HOME = "خانه";
  private NavigationDrawerItemView view;

  public NavigationDrawerPresenter(NavigationDrawerItemView view) {
    this.view = view;
  }

  public void onItemSelected(String drawerItem) {
    switch (drawerItem){
      case THIS_WEEK:
        view.render(new CurrentWeekExpenseFragment());
        break;
      case THIS_MONTH:
        view.render(new CurrentMonthExpenseFragment());
        break;
      case HOME:
        view.goToHome();
        break;
    }
  }
}
