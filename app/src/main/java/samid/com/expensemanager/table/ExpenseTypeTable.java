package samid.com.expensemanager.table;

import android.provider.BaseColumns;

import java.util.ArrayList;
import java.util.List;

import samid.com.expensemanager.model.ExpenseType;

public class ExpenseTypeTable implements BaseColumns {
  public static final String TABLE_NAME = "expense_types";
  public static final String TYPE = "type";

  public static final String CREATE_TABLE_QUERY = "create table " + TABLE_NAME + " ("+ _ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "+ TYPE +" TEXT)";
  public static final String SELECT_ALL = "SELECT * FROM " + TABLE_NAME;

  public static List<ExpenseType> seedData(){
    ArrayList<ExpenseType> expenseTypes = new ArrayList<>();
    expenseTypes.add(new ExpenseType("غذا"));
    expenseTypes.add(new ExpenseType("سفر"));
    expenseTypes.add(new ExpenseType("سلامتی"));
    expenseTypes.add(new ExpenseType("فروشگاه"));
    expenseTypes.add(new ExpenseType("انتقال وجه"));
    expenseTypes.add(new ExpenseType("موارد دیگر"));

    return expenseTypes;
  }
}
