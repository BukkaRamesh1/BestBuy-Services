package com.sample.concepts;

public class GitCommands {
	
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * it clone https://RameshB4@bitbucket.org/resmeddc/ros-ep.git
git branch
git branch <new-branch>
git checkout master
git fetch

git fetch origin <branchName>
git pull origin master
git pull
git status
git stash

git add
git commit -m "commit messages"
git push -u origin  branchName
git reset --hard origin/branchName
git clean -d -f -f
git checkout -- filename (reset to previous commit)
git clean -fd somefolder (reset to previous commit)

git config --system core.longpaths true (filename too long)
git reset --hard HEAD  (Hard delete unpublished commits)

git log --reflog   (get all previos commits)
git checkout -b old-state 0d1d7fc32  (Temporarily switch to a different commit)
******** Undo published commits with new commits
git revert a867b4af 25eee4ca 0766c053  (This will create three separate revert commits:)
git revert HEAD~2..HEAD (It also takes ranges. This will revert the last two commits:)

# Reverting a merge commit
git revert -m 1 <merge_commit_sha>

	 * 
	 */

}
