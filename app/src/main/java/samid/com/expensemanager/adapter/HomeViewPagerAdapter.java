package samid.com.expensemanager.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import samid.com.expensemanager.activity.ExpenseFragment;
import samid.com.expensemanager.activity.TodaysExpenseFragment;

public class HomeViewPagerAdapter extends FragmentStatePagerAdapter {
  public HomeViewPagerAdapter(FragmentManager supportFragmentManager) {
    super(supportFragmentManager);
  }

  @Override
  public Fragment getItem(int position) {
    switch (position){
      case 0:
        return new ExpenseFragment();
      case 1:
        return new TodaysExpenseFragment();
    }

    return null;
  }

  @Override
  public int getCount() {
    return 2;
  }
}
