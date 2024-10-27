package com.benarytree.service;

import com.benarytree.preordermodel.Node;
import org.springframework.stereotype.Service;

@Service
public class PreorderTraversalService implements TraversalService {
    @Override
    public void preorderTraversal(Node root){
        if(root == null){
            return;

        }

        System.out.print(root.getValue() + " ");
        preorderTraversal((root.getLeft()));
        preorderTraversal(root.getRight());

    }

}
