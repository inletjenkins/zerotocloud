import com.netflix.asgard.Region

def accountNumber = '@ACCOUNT_NUMBER@'
grails {
    awsAccounts = [accountNumber]
    awsAccountNames = [(accountNumber): 'prod']
}
cloud {
    accountName="prod"
    publicResourceAccounts=[]
    defaultKeyName = 'zerotocloud'
    defaultSecurityGroups = []
    launchConfig {
        ebsVolumes {
            instanceTypeNeeds = { String instanceType ->
                false // instanceType.startsWith('m3.')
            }
        }
    }
}
eureka {
    urlContext = ''
}

