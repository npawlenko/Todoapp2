package com.np.tasks;

import androidx.fragment.app.Fragment;

import com.np.tasks.fragment.TaskFragment;
import com.np.tasks.fragment.TaskListFragment;

import java.util.UUID;

public class MainActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        UUID taskId = (UUID) getIntent().getSerializableExtra(TaskListFragment.KEY_EXTRA_TASK_ID);
        return TaskFragment.newInstance(taskId);
    }
}