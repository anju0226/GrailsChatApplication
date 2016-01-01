import com.ggchat.auth.Role
import com.ggchat.auth.User
import com.ggchat.auth.UserRole

class BootStrap {

    def init = { servletContext ->

        def userRole = Role.findOrSaveWhere(authority: 'ROLE_USER')

        def simpleUser = User.findOrSaveWhere(username: 'user', password: 'user',enabled: true)

        if (!(simpleUser.authorities.contains(userRole))) {
            UserRole.create(simpleUser, userRole, true)

        }



    }
    def destroy = {
    }
}
