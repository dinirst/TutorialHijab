package id.sch.smktelkom_mlg.privateassignment.xirpl610.dewean;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CasualFragment extends Fragment {

    public static String urlSimple = "http://www.gookkis.com/wp-content/uploads/2016/03/orzgDBXs.png";
    public static String urlPlaceholder = "http://www.gookkis.com/wp-content/uploads/2016/03/hello-android.png";
    public static String urlResizeCrop = "http://www.gookkis.com/wp-content/uploads/2016/03/android.jpg";
    Button btnSimple, btnPlaceholder, btnResizeCrop;
    ImageView imageView;

    public CasualFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();
        initOnClick();

    }

    private void initOnClick() {
    }

    private void initView() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_casual, container, false);


    }

}
