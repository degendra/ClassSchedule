package np.pro.degendra.classschedule.restClient;

import android.util.Log;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.EBean.Scope;
import org.androidannotations.annotations.rest.RestService;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.androidannotations.api.rest.RestErrorHandler;
import org.springframework.core.NestedRuntimeException;

/**
 * Created by degendra on 05/31/15.
 */
@EBean(scope = Scope.Singleton)
public class ClassScheduleRequest {
    public static final int PAGE_SIZE = 25;

    protected static ClassScheduleRequest proPakRequest;

    @RestService
    public ClassScheduleClient classScheduleClient;

    @Pref
    public ClassSchedulePrefs_ prefs;

    public boolean hasError = true;

    @AfterInject
    public void initClient(){
        classScheduleClient.setRestErrorHandler(new RestErrorHandler() {
            @Override
            public void onRestClientExceptionThrown(NestedRuntimeException e) {
                Log.e("error",e.getMessage());
            }
        });


    }
}
