package ro.ovidiuconeac.users.androidapp.components.edituser.mvp.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ro.ovidiuconeac.users.androidapp.R;
import ro.ovidiuconeac.users.androidapp.components.edituser.mvp.presenter.EditUserPresenterImpl;

/**
 * Created by www.ovidiuconeac.ro on 4/18/17.
 */

public class EditUserViewImpl extends Fragment implements EditUserView {

    private EditUserPresenterImpl presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.edit_user_view, container, false);

        // Bind to view items

        return view;
    }


    @Override
    public void requestUpdateUser() {

    }

    @Override
    public void postUpdateUserSuccessful() {

    }

    @Override
    public void requestRemoveUser() {

    }

    @Override
    public void postRemoveUserSuccessful() {

    }

    @Override
    public void postWrongUserInput() {

    }

    @Override
    public void requestResetUserInterface() {

    }

    @Override
    public void requestResetUserMessage() {

    }

    @Override
    public void requestShowUsers() {

    }
}
