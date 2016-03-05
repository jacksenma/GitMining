import InfoReader

def readAllProjectInfo(ownerName,projectName):
    url=InfoReader.url+ownerName+'/'+projectName
    the_info=InfoReader.getInfoList(url)
    return(the_info)

def readProjectLanguageInfo(ownerName,projectName):
    url=InfoReader.url+ownerName+'/'+projectName+'/languages'
    return InfoReader.getInfoList(url)

def readProjectInfoItem(ownerName,projectName,itemName):
    url=InfoReader.url+ownerName+'/'+projectName+'/item/'+itemName
    return InfoReader.getInfoList(url)

def readProjectContributorInfo(ownerName,projectName):
    url=InfoReader.url+ownerName+'/'+projectName+'/contributors'
    return InfoReader.getInfoList(url)

def readProjectContributorInfoLogin(ownerName,projectName):
    url=InfoReader.url+ownerName+'/'+projectName+'/contributors/login'
    return InfoReader.getInfoList(url)

def readProjectCollaborators(ownerName,projectName):
    url=InfoReader.url+ownerName+'/'+projectName+'/collaborators'
    return InfoReader.getInfoList(url)

def readProjectCollaboratorsLogin(ownerName,projectName):
    url=InfoReader.url+ownerName+'/'+projectName+'/collaborators/login'
    return InfoReader.getInfoList(url)

def readProjectBranchName(ownerName,projectName):
    url=InfoReader.url+ownerName+'/'+projectName+'/branches/names'
    return InfoReader.getInfoList(url)

def readProjectBranchInfo(ownerName,projectName,branchName):
    url=InfoReader.url+ownerName+'/'+projectName+'/branch/'+branchName
    return InfoReader.getInfoList(url)

def readProjectBranchItem(ownerName,projectName,branchName,itemName):
    url=InfoReader.url+ownerName+'/'+projectName+'/branch/'+branchName+'/item/'+itemName
    return InfoReader.getInfoList(url)