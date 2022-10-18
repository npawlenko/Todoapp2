package com.np.tasks;

import androidx.fragment.app.Fragment;

import com.np.tasks.fragment.TaskListFragment;

public class TaskListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new TaskListFragment();
    }
}