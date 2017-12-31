package frameworks.retrofit;import java.util.List;import retrofit2.Call;import retrofit2.http.Body;import retrofit2.http.POST;import transport.school.com.schoolapp.bean.AttendanceRecord;import transport.school.com.schoolapp.bean.AttendanceUpdateResponse;import transport.school.com.schoolapp.bean.LoginRequest;import transport.school.com.schoolapp.bean.LoginResponse;import transport.school.com.schoolapp.bean.Route;import transport.school.com.schoolapp.bean.RouteStudentList;public interface WebServices {    @POST("?device=phone&api=teacherlogin")    public Call<LoginResponse> login(@Body LoginRequest loginRequest);    @POST("?device=phone&api=routestudents")    public Call<RouteStudentList> getStudentListForRoute(@Body Route route);    @POST("?device=phone&api=attendance")    public Call<AttendanceUpdateResponse> postStudentAttendence(@Body AttendanceRecord attendanceRecord);    @POST("?device=phone&api=absent")    public Call<AttendanceUpdateResponse> postStudentAbsent(@Body AttendanceRecord attendanceRecord);}