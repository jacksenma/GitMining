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

def readProjectAllForkItem(ownerName,projectName):
    url=InfoReader.url+ownerName+'/'+projectName+'/forks'
    return InfoReader.getInfoList(url)

def readProjectAllForkName(ownerName,projectName):
    url=InfoReader.url+ownerName+'/'+projectName+'/forks/names'
    return InfoReader.getInfoList(url)

def readProjectSingleForkItem(ownerName,projectName):
    url=InfoReader.url+'fork/'+ownerName+'/'+projectName
    return InfoReader.getInfoList(url)

def readProjectSingleForkSingleItem(ownerName,projectName,itemName):
    url=InfoReader.url+'fork/'+ownerName+'/'+projectName+'/item/'+itemName
    return InfoReader.getInfoList(url)


def readProjectPullRequest(ownerName,projectName,pageName='1'):
    url=InfoReader.url+ownerName+'/'+projectName+'/pulls(?page='+pageName+')'
    return InfoReader.getInfoList(url)

def readProjectPullRequestNumber(ownerName,projectName,pageName='1'):
    url=InfoReader.url+ownerName+'/'+projectName+'/pulls'+'/numbers(?page='+pageName+')'
    return InfoReader.getInfoList(url)

def readProjectSinglePullRequest(ownerName,projectName,number):
    url=InfoReader.url+ownerName+'/'+projectName+'/pull/'+number
    return InfoReader.getInfoList(url)

def readProjectPullRequestItem(ownerName,projectName,number,item):
    url=InfoReader.url+ownerName+'/'+projectName+'/pull/'+number+'/item/'+item
    return InfoReader.getInfoList(url)

def readProjectIssues(ownerName,projectName,pageName='1'):
    url=InfoReader.url+ownerName+'/'+projectName+'/issues(?page='+pageName+')'
    return InfoReader.getInfoList(url)

def readProjectIssuesNumber(ownerName,projectName,pageName='1'):
    url=InfoReader.url+ownerName+'/'+projectName+'/issues'+'/numbers(?page='+pageName+')'
    return InfoReader.getInfoList(url)

def readProjectSingleIssues(ownerName,projectName,number):
    url=InfoReader.url+ownerName+'/'+projectName+'/issue/'+number
    return InfoReader.getInfoList(url)

def readProjectIssuesItem(ownerName,projectName,number,item):
    url=InfoReader.url+ownerName+'/'+projectName+'/issue/'+number+'/item/'+item
    return InfoReader.getInfoList(url) 

def readProjectCommits(ownerName,projectName,pageName='1'):
    url=InfoReader.url+ownerName+'/'+projectName+'/commits(?page='+pageName+')'
    return InfoReader.getInfoList(url)

def readProjectCommitsNumber(ownerName,projectName,pageName='1'):
    url=InfoReader.url+ownerName+'/'+projectName+'/commits'+'/shas(?page='+pageName+')'
    return InfoReader.getInfoList(url)

def readProjectSingleCommit(ownerName,projectName,sha):
    url=InfoReader.url+ownerName+'/'+projectName+'/commit/'+sha
    return InfoReader.getInfoList(url)

def readProjectCommitItem(ownerName,projectName,sha,item):
    url=InfoReader.url+ownerName+'/'+projectName+'/commit/'+sha+'/item/'+item
    return InfoReader.getInfoList(url)

def readProjectComments(ownerName,projectName,number):
    url=InfoReader.url+ownerName+'/'+projectName+'/issue/'+number+'/comments'
    return InfoReader.getInfoList(url)

def readProjectCommitComment(ownerName,projectName,sha):
    url=InfoReader.url+ownerName+'/'+projectName+'/commit/'+sha+'/comments'
    return InfoReader.getInfoList(url)

def readProjectUser(user):
    url=InfoReader.url1+user
    return InfoReader.getInfoList(url)

def readProjectUserItem(user,item):
    url=InfoReader.url1+user+'/item/'+item
    return InfoReader.getInfoList(url)

def readProjectStargazers(ownerName,projectName,pageName='1'):
    url=InfoReader.url1+ownerName+'/'+projectName+'/stargazers(?page='+pageName+')'
    return InfoReader.getInfoList(url)

def readProjectStargazersName(ownerName,projectName,pageName='1'):
    url=InfoReader.url1+ownerName+'/'+projectName+'/stargazers/'+'names(?page='+pageName+')'
    return InfoReader.getInfoList(url)

def readProjectSubscribers(ownerName,projectName,pageName='1'):
    url=InfoReader.url1+ownerName+'/'+projectName+'/subscribers(?page='+pageName+')'
    return InfoReader.getInfoList(url)

def readProjectSubscribersName(ownerName,projectName,pageName='1'):
    url=InfoReader.url1+ownerName+'/'+projectName+'/subscribers/'+'names(?page='+pageName+')'
    return InfoReader.getInfoList(url)


    