import com.nixilla.jobeet.Category

class BootStrap {

    def init = { servletContext ->

        def designCategory = Category.findOrSaveByName('Design')
        def programmingCategory = Category.findOrSaveByName('Programming')
        def managerCategory = Category.findOrSaveByName('Manager')
        def administratorCategory = Category.findOrSaveByName('Administrator')

    }
    def destroy = {
    }
}
