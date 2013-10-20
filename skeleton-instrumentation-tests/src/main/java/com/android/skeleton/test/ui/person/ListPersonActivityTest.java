package com.android.skeleton.test.ui.person;

import com.android.skeleton.R;
import com.android.skeleton.ui.person.ListPersonActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;

public class ListPersonActivityTest extends ActivityInstrumentationTestCase2<ListPersonActivity>{
	
    public ListPersonActivityTest() {
        super(ListPersonActivity.class);
    }

    public void testActivity_not_null() {
        assertNotNull(getActivity());
    }

    @UiThreadTest
    public void testisAddPersonButtonVisible() throws Exception {
        // given
        ListPersonActivity activityUnderTest = getActivity();

        // when
        Button button = (Button) activityUnderTest.findViewById(R.id.add_person_button);
        
        // Then
        assertTrue(button.isShown());
    }

}
